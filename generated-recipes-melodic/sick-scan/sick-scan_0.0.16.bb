# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A ROS driver for the SICK TiM and SICK MRS series of laser scanners.     This package is based on the original sick_tim-repository of Martin Günther et al."
AUTHOR = "Michael Lehning <michael.lehning@lehning.de>"
HOMEPAGE = "http://wiki.ros.org/sick_scan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "sick_scan"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    dynamic-reconfigure \
    message-generation \
    pcl-conversions \
    pcl-ros \
    roscpp \
    sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    dynamic-reconfigure \
    message-runtime \
    pcl-conversions \
    pcl-ros \
    roscpp \
    sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-updater \
    dynamic-reconfigure \
    message-runtime \
    pcl-conversions \
    pcl-ros \
    roscpp \
    sensor-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/SICKAG/sick_scan-release/archive/release/melodic/sick_scan/0.0.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b0703ab09cd9d4c90020acbef85dd09b"
SRC_URI[sha256sum] = "d0c506df63940a7cbee85eb4c56ab229459315184e65e6fa3f9f4aa827fe324a"
S = "${WORKDIR}/sick_scan-release-release-melodic-sick_scan-0.0.16-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('sick-scan', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sick-scan/sick-scan_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sick-scan/sick-scan-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sick-scan/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sick-scan/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
