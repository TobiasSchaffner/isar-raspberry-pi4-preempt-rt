#
# Copyright (c) Siemens AG, 2023
#
# SPDX-License-Identifier: MIT

require recipes-kernel/linux/linux-custom.inc

SRC_URI += " \
    git://github.com/TobiasSchaffner/linux.git;protocol=https;branch=tobsch/rpi-6.1.y-preempt-rt;destsuffix=linux-rpi4-${PV} \
    file://preempt-rt.cfg"

SRCREV = "163ec1bfd4b289b6d22847f69157002ec01576dc"

S = "${WORKDIR}/linux-rpi4-${PV}"

KERNEL_DEFCONFIG ?= "bcm2711_defconfig"

LINUX_VERSION_EXTENSION = "-isar"
