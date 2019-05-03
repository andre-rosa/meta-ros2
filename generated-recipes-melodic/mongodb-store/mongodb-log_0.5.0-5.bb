# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The mongodb_log package"
AUTHOR = "Marc Hanheide <marc@hanheide.net>"
HOMEPAGE = "http://ros.org/wiki/mongodb_log"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fe8b75cf0aba647401e1038bcd69ee74"

ROS_BPN = "mongodb_log"

ROS_BUILD_DEPENDS = " \
    mongodb-store \
    openssl \
    rosgraph \
    roslib \
    rospy \
    rostopic \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    mongodb-store \
    python-pymongo \
    rosgraph \
    roslib \
    rospy \
    rostopic \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mongodb-store \
    python-pymongo \
    rosgraph \
    roslib \
    rospy \
    rostopic \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_log/0.5.0-5.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "61f1eaf88310b82cdb6a258d6fb1b0b2"
SRC_URI[sha256sum] = "5ce0f217758fb3d15c24d5e6a00c59116028201b7ae95e3b5fa91af0ed8d5f2d"
S = "${WORKDIR}/mongodb_store-release-melodic-mongodb_log-0.5.0-5"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('mongodb-store', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mongodb-store/mongodb-store_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mongodb-store/mongodb-store-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mongodb-store/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mongodb-store/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
