# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A viewer for the SLAM component of roboception based on ROS and PCL"
AUTHOR = "Felix Endres <felix.endres@roboception.de>"
HOMEPAGE = "https://wiki.ros.org/rc_cloud_accumulator"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libvtk-qt \
    nav-msgs \
    pcl \
    pcl-ros \
    roscpp \
    std-srvs \
    tf2 \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    libvtk-qt \
    nav-msgs \
    pcl \
    pcl-ros \
    roscpp \
    std-srvs \
    tf2 \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    libvtk-qt \
    nav-msgs \
    pcl \
    pcl-ros \
    roscpp \
    std-srvs \
    tf2 \
    tf2-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/roboception-gbp/rc_cloud_accumulator-release/archive/release/melodic/rc_cloud_accumulator/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "23807b23e2ab9c74379c6cba81bafe33"
SRC_URI[sha256sum] = "6356622f9801312add690a710948202c253adab5a5540ae0875e9bca83c8ee40"
S = "${WORKDIR}/rc_cloud_accumulator-release-release-melodic-rc_cloud_accumulator-1.0.4-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rc-cloud-accumulator/rc-cloud-accumulator_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rc-cloud-accumulator/rc-cloud-accumulator_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rc-cloud-accumulator/rc-cloud-accumulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rc-cloud-accumulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rc-cloud-accumulator/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
